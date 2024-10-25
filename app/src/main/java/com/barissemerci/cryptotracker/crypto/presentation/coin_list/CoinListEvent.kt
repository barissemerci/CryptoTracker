package com.barissemerci.cryptotracker.crypto.presentation.coin_list

import com.barissemerci.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}