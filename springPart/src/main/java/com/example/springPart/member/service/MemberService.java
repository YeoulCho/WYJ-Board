package com.example.springPart.member.service;


import com.example.springPart.member.form.MemberLoginRequestForm;
import com.example.springPart.member.form.MemberLoginResponseForm;
import com.example.springPart.member.controller.form.MemberRequestForm;


public interface MemberService {
    MemberLoginResponseForm login(MemberLoginRequestForm requestForm);

    Member register(MemberRequestForm requestForm);

}
