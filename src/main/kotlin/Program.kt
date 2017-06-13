import com.rsk.Providers

fun main(args: Array<String>) {
    getAllProviders{ key, value -> println("$key -> $value") }


    val provider = Providers()
    val allProviders = provider.getAllProviders("Random")
    allProviders.forEach(::println)
}

private fun getAllProviders(fn: (String, String) -> Unit) {
    val allProviders = Providers.getProviders()
    for (p in allProviders)
        p.forEach {key, value -> fn(key.toString(), value.toString())}
}