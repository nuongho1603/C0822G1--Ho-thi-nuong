package com.reponsitory;

import com.modal.Email;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.ArrayList;
import java.util.List;

public class EmailReponsitory implements IEmailReponsitory {
    private static List<Email> emailList = new ArrayList<>();

    static {
        emailList.add(new Email(1, "English", 10, true, "Thor king,Asgard"));
        emailList.add(new Email(2, "Vietnamese", 15, true, "Thor king,Asgard"));
        emailList.add(new Email(3, "English", 20, false, "Thor king,Asgard"));
    }

    @Override
    public List<Email> selectAllEmail() {
        return emailList;
    }

    @Override
    public Email selectById(int id) {
        for (Email e : emailList) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void update(Email email, int id) {
        Email email1 =selectById(id);
        email1.setLanguages(email.getLanguages());
        email1.setPageSize(email.getPageSize());
        email1.setSpamFilter(email.isSpamFilter());
        email1.setSignature(email.getSignature());
    }

//    @Override
//    public void update(Email email) {
//emailList.get(id).setLanguages(email.getLanguages());
//emailList.get(0).setPageSize(email.getPageSize());
//emailList.get(0).setId(email.getId());
//    }


}
