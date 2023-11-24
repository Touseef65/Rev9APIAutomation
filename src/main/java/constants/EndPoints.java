package constants;
import helpers.PersonServiceHelper;
public class EndPoints{
/*
    -------------------------------------------------------------------------------
        Endpoints for testing project reqres.in...
    -------------------------------------------------------------------------------
   */
    public static final String GET_ALL_USERS ="/api/users";
    public static final String CREATE_USERS ="/api/users";
    public static final String UPDATE_PATCH ="/api/users/"+PersonServiceHelper.id;
    public static final String UPDATE_USERS ="/api/users/"+PersonServiceHelper.id;
    public static final String DELETE_USER ="/api/users/"+PersonServiceHelper.id;

    /*
    ---------------------------------------------------------------------------------
        Endpoints for Superkiwi-Web...
    ---------------------------------------------------------------------------------
    */

    public static final String GET_PUSHER_CREDENTIALS ="/shops/pusher-app-key";
}