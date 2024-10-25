package com.barissemerci.cryptotracker.crypto.domain

import com.barissemerci.cryptotracker.core.domain.util.NetworkError
import com.barissemerci.cryptotracker.core.domain.util.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}