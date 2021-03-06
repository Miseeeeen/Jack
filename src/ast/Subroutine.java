package ast;

import java.util.List;

import ast.statement.Statement;

public class Subroutine {
    String kind; // "constructor", "function", "method"
    Type type;
    String name;
    List<Variable> parameters;
    List<Statement> body;

    public Subroutine(String kind, Type type, String name, List<Variable> parameters,
            List<Statement> body) {
        this.kind = kind;
        this.type = type;
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Variable> getParameters() {
        return parameters;
    }

    public void setParameters(List<Variable> parameters) {
        this.parameters = parameters;
    }

    public List<Statement> getBody() {
        return body;
    }

    public void setBody(List<Statement> body) {
        this.body = body;
    }
    
    public boolean isStatic(){
        return kind.equals("function");
    }
    
    public boolean isConstructor(){
        return kind.equals("constructor");
    }
    
    public boolean isMethod(){
        return kind.equals("method");
    }

}
