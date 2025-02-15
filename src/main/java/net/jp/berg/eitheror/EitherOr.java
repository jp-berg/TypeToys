package net.jp.berg.eitheror;

public sealed abstract class EitherOr<T1, T2> {

    public static final class Either<T1, T2> extends EitherOr<T1, T2>{
        private final T1 VALUE;

        public Either(T1 value){
            VALUE = value;
        }
        public T1 get(){
            return VALUE;
        }

    }

    public static final class Or<T1, T2> extends EitherOr<T1, T2>{
        private final T2 VALUE;

        public Or(T2 value){
            VALUE = value;
        }

        @Override
        public T2 get() {
            return VALUE;
        }


    }

    public abstract Object get();



}
