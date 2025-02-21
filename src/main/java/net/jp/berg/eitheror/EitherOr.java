package net.jp.berg.eitheror;

public sealed interface EitherOr<T1, T2> {

    final class Either<T1, T2> implements EitherOr<T1, T2>{
        private final T1 VALUE;

        public Either(T1 value){
            VALUE = value;
        }
        @Override
        public T1 get(){
            return VALUE;
        }

    }

    final class Or<T1, T2> implements EitherOr<T1, T2>{
        private final T2 VALUE;

        public Or(T2 value){
            VALUE = value;
        }

        @Override
        public T2 get() {
            return VALUE;
        }


    }

    Object get();



}
