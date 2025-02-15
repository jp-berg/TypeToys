package net.jp.berg.eitheror;

public class EitherOrRunner
{
    public static void main( String[] args )
    {
        EitherOr<String, Integer> first = new EitherOr.Either<>("Hello");
        EitherOr<String, Integer> second = new EitherOr.Or<>(3);

        processStringOrInt(first);
        processStringOrInt(second);

        EitherOr<Float, Boolean> third = new EitherOr.Or<>(true);
        EitherOr<Float, Boolean> fourth = new EitherOr.Either<>(17.84f);

        processFloatOrBool(third);
        processFloatOrBool(fourth);





    }

    public static void processStringOrInt(EitherOr<String, Integer> eo){

        switch (eo){
            case EitherOr.Either<String, Integer> either -> System.out.println("String: " + either.get());
            case EitherOr.Or<String, Integer> or -> System.out.println("Integer calculation: " +  (or.get() + 17));
        }
    }

    public static void processFloatOrBool(EitherOr<Float, Boolean> eo){
        switch (eo){
            case EitherOr.Either<Float, Boolean> either -> System.out.println("Float calculation: " + (either.get() + 18.9));
            case EitherOr.Or<Float, Boolean> or -> System.out.println("Boolean evaluation: " +  (or.get()? "yes": "no"));
        }
    }
}
