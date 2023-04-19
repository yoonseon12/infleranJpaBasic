package infleranJpaBasic.inheritanceExample;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@DiscriminatorValue("Albums")
public class Albums extends Items {
	private String artist;
}
