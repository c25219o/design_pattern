package jp.co.opst.design_pattern.p08_abstractfactory.factory;

public abstract class Factory {

	public static Factory getFactory(String classname) {
        try {
            return (Factory) Class.forName(classname).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            return null;
		}
    }

	public abstract Link createLink(String caption, String url);

	public abstract Tray createTray(String caption);

	public abstract Page createPage(String title, String author);

}
