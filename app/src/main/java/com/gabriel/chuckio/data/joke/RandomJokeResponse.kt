package  com.gabriel.chuckio.data.joke

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

public class RandomJokeResponse {
    @SerializedName("category")
    @Expose
    var category: List<String>? = null
    @SerializedName("icon_url")
    @Expose
    var iconUrl: String? = null
    @SerializedName("id")
    @Expose
    var id: String? = null
    @SerializedName("url")
    @Expose
    var url: String? = null
    @SerializedName("value")
    @Expose
    var value: String? = null
}