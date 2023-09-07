import React, { useState } from "react";
import { registerUser } from "../../api/users";

function Main(props) {
  const [userInfo, setUserInfo] = useState({
    userId: "",
    username: "",
    name: "",
    phone: "",
  });

  const [userList, setUserList] = useState([]);

  const onChange = ({ target }) => {
    const { name, value } = target;
    setUserInfo({
      ...userInfo,
      [name]: value,
    });
  };

  const onRegisterClick = () => {
    registerUser(userInfo).then((resp) => {
      console.log(resp.data);
      setUserList([...userList, resp.data]);
    });
  };

  const onUpdateClick = () => {};

  const onDeleteClick = () => {};

  return (
    <>
      <div>
        <div>
          <input
            type="text"
            name="userId"
            placeholder="아이디"
            onChange={onChange}
          />
        </div>
        <div>
          <input
            type="text"
            name="username"
            placeholder="이름"
            onChange={onChange}
          />
        </div>
        <div>
          <input
            type="text"
            name="name"
            placeholder="이름"
            onChange={onChange}
          />
        </div>
        <div>
          <input
            type="text"
            name="phone"
            placeholder="휴대전화번호"
            onChange={onChange}
          />
        </div>
        <button onClick={onRegisterClick}>추가하기</button>
        <button onClick={onUpdateClick}>수정하기</button>
        <button onClick={onDeleteClick}>삭제하기</button>
      </div>
      <ul>
        {userList?.map((e) => {
          return (
            <li>
              {e.userId}, {e.password}, {e.name}, {e.email}
            </li>
          );
        })}
      </ul>
    </>
  );
}

export default Main;
