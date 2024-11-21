package com.alphaStore.wallet.model.minifiedImpl



import com.alphaStore.wallet.model.minified.FetchMostRecentMinified
import java.time.Instant

data class FetchMostRecentMinifiedImpl(
    override var id: String,
    override var createdDate: Instant
) : FetchMostRecentMinified