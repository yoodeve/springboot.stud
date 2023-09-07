import React, { useState } from "react";

function Register(props) {
  const [userInfo, setUserInfo] = useState({
    username: "",
    password: "",
    name: "",
    email: "",
  });

  const onChange = ({ target }) => {
    const { name, value } = target;
    setUserInfo({
      ...userInfo,
      [name]: value,
    });
  };

  return (
    <div>
      <div>
        <input type="text" name="username" placeholder="" onChange={onChange} />
      </div>
      <div>
        <input
          type="password"
          name="password"
          placeholder=""
          onChange={onChange}
        />
      </div>
      <div>
        <input type="text" name="name" placeholder="" onChange={onChange} />
      </div>
      <div>
        <input type="text" name="email" placeholder="" onChange={onChange} />
      </div>
      <button>추가하기</button>
    </div>
  );
}

export default Register;
