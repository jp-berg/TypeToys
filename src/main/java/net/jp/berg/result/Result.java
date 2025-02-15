package net.jp.berg.result;

import java.util.Optional;

public sealed interface Result<V, E extends Exception> {

    final class Value<V, E extends Exception> implements Result<V, E> {

    }

}
