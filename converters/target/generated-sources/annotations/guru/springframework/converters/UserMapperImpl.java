package guru.springframework.converters;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-13T11:41:52-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (IBM Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand userToUserCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        userCommand.setFirstName( user.getFirstName() );
        userCommand.setLastName( user.getLastName() );
        userCommand.setEmail( user.getEmail() );

        return userCommand;
    }

    @Override
    public User userCommandToUser(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.firstName( userCommand.getFirstName() );
        user.lastName( userCommand.getLastName() );
        user.email( userCommand.getEmail() );

        return user.build();
    }
}
