package ru.mirea.lab.service

import org.springframework.stereotype.Service

@Service
class SecuredService {
    fun request(requestData: String) = requestData
}