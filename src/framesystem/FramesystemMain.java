package framesystem;

public class FramesystemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FramesystemController controller = new FramesystemController();
		FramesysemView frame = new FramesysemView(controller);
		frame.setBounds(5,5,655,455);
		frame.setVisible(true);
	}
}
