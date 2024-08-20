package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    // the comment below is used for explaining to a code reader or other developers what the method below is doing
    /**
    @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);


    /**
     *
     * @param mobileNumber - Input mobile number
     * @return Account details based on a given phoneNumber
     */

    CustomerDto fetchAccount(String mobileNumber);


    /**
     *
     * @param customerDto - CustomerDto Object
     * @return boolean indicating if the update of account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - input mobile Number
     * @return boolean indicating if the deletion of an Account details is Successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
