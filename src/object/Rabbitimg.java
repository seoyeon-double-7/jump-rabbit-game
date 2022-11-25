package object;

import java.awt.Image;

import javax.swing.ImageIcon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rabbitimg {
	private ImageIcon cookieIc=new ImageIcon("img/RabbitImg/cookie1/rightRabbit.gif"); // 기본모션
	private ImageIcon jumpIc=new ImageIcon("img/RabbitImg/cookie1/rightRabbit.gif");; // 점프모션
	private ImageIcon doubleJumpIc=new ImageIcon("img/RabbitImg/cookie1/rightRabbit.gif");; // 더블점프모션
	private ImageIcon fallIc=new ImageIcon("img/RabbitImg/cookie1/rightRabbit.gif");; // 낙하모션(더블 점프 후)
	private ImageIcon slideIc= new ImageIcon("img/RabbitImg/cookie1/damageRabbit.gif"); // 슬라이드 모션
	private ImageIcon hitIc= new ImageIcon("img/RabbitImg/cookie1/damageRabbit.gif"); // 부딛히는 모션
}
