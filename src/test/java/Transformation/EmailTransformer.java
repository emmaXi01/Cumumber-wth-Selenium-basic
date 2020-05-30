package Transformation;


import io.cucumber.cucumberexpressions.Transformer;

public class EmailTransformer implements Transformer<String> {

    @Override
    public String transform(String username) throws Throwable{
       return username.concat("@ea.com");
   }
}
