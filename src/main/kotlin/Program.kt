import com.rsk.Providers

fun main(args: Array<String>) {
    val allProviders = Providers.getProviders()
    for (p in allProviders)
        p.forEach { key, value -> println("\t $key - $value") }
}