package dongguk.rangers.domain.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Connect")
@NoArgsConstructor
@AllArgsConstructor
public class Connect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long connectId;

    // 보호자 아이디와의 연결
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "guardId", nullable = false)
    private Users guard;

    // 피부양자 아이디와의 연결
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dependantId", nullable = false)
    private Users dependant;
}