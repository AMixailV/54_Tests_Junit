package ru.mixail_akulov.a54_tests_junit

/**
 * Потребитель ресурсов.
 * Пример использования:
 * ```
 *     val consumer: Consumer<String> = { string ->
 *         println(string)
 *     }
 *     resourceManager.consumeResource(consumer)
 * ```
 */
typealias Consumer<R> = (R) -> Unit
