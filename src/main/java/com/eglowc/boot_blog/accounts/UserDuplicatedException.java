package com.eglowc.boot_blog.accounts;


import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * Created by hclee on 2016-05-11.
 */
@AllArgsConstructor
public class UserDuplicatedException extends RuntimeException {

    @Getter
    String userName;

}
