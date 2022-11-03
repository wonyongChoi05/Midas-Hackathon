package kosamidas.hackathon.domain.user.presentation.dto.res;

import kosamidas.hackathon.domain.user.domain.User;
import kosamidas.hackathon.domain.user.domain.type.Authority;
import kosamidas.hackathon.domain.user.domain.type.Department;
import kosamidas.hackathon.domain.user.domain.type.HomeStatus;
import kosamidas.hackathon.domain.user.domain.type.SignupStatus;
import lombok.Getter;

@Getter
public class UserResponseDto {

    private final Long id;
    private final String authId;
    private final String name;
    private final Department department; // 부서
    private final Authority authority; // 권한
    private final SignupStatus signupStatus; // 회원가입 상태(대기, 수락, 거절)
    private final HomeStatus homeStatus; // 재택근무 상태(대기, 수락, 거절)

    public UserResponseDto(User user) {
        this.id = user.getId();
        this.authId = user.getAuthId();
        this.name = user.getName();
        this.department = user.getDepartment();
        this.authority = user.getAuthority();
        this.signupStatus = user.getSignupStatus();
        this.homeStatus = user.getHomeStatus();
    }
}
