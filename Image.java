import java.awt.*;

import javax.swing.*;

public class Image{

	public static void main(String[] args){

		GetImage getImage = new GetImage();
		getImage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getImage.setSize(300, 300);
		getImage.setVisible(true); 

	}

}


class GetImage extends JFrame{

	public GetImage(){

		super("Image Choir");

		Icon icon = new ImageIcon(getClass().getResource("img.jpg"));
		JLabel label = new JLabel(icon);

		add(label, BorderLayout.CENTER);

		Container container = new Container();
		container = getContentPane();
		container.setBackground(Color.GREEN);
		
	}

}