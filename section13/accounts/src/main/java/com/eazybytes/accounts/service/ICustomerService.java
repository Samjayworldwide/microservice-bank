package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;

public interface ICustomerService {

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Customer Details based on a given Mobile Number
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);
}
