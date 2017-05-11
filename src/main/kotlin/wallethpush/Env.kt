package wallethpush

import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import wallethpush.model.eth_jsonrpc.BlockInformationResponse
import wallethpush.model.eth_jsonrpc.BlockNumberResponse

val okhttp = OkHttpClient.Builder().build()!!
val blockNumberAdapter = Moshi.Builder().build().adapter(BlockNumberResponse::class.java)!!
val blockInfoAdapter = Moshi.Builder().build().adapter(BlockInformationResponse::class.java)!!