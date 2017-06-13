package com.rsk

import java.security.Provider
import java.security.Security

data class ProviderDetails(val providerName: String, val name: String)

class Providers {

    fun getAllProvidersOld(filter: String): List<ProviderDetails> {
        val providers = Security.getProviders()
        val allProviders = mutableListOf<ProviderDetails>()

        providers.forEach {
            provider ->
            val providerDetails = provider.entries
                    .filter { it -> it.key.toString().contains(filter, true) }
                    .map { ProviderDetails(provider.name, it.key.toString()) }
            allProviders += providerDetails
        }

        return allProviders
    }

    fun getAllProviders(filter: String): List<ProviderDetails> {
        val providers = Security.getProviders()

        return providers.flatMap {
            provider -> provider.entries
                    .filter { it -> it.key.toString().contains(filter, true) }
                    .map { ProviderDetails(provider.name, it.key.toString()) }
        }
    }

    companion object {
        fun getProviders(): List<Provider> {
            val providers = Security.getProviders()
            return providers.asList()
        }
    }

}