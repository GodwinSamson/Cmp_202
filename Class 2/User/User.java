class User {
    String name;
    String password;

    String login(){
        return "Logged In";

    }
    String logOut(){
        return "you logged out";
    }

    String Register(){
        if (name.equals("") || password.equals("")){
            return "Can't be empty";
        

        }else {
            return "Success";
        }

    }
}