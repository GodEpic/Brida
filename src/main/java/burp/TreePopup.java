package burp;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class TreePopup extends JPopupMenu {
	
	//JMenuItem trapItem;
	//JMenuItem trapWithBacktraceItem;
	
	//BurpExtender ex;
	
	private static final long serialVersionUID = 1L;

	public TreePopup(BurpExtender ex){
		
		//this.ex = ex;
		
		JMenuItem trapItem = new JMenuItem("Inspect!");
        trapItem.setActionCommand("trap");
        trapItem.addActionListener(ex);
        add(trapItem);
        
        JMenuItem trapWithBacktraceItem = new JMenuItem("Inspect with backtrace!");
        trapWithBacktraceItem.setActionCommand("trapBacktrace");
        trapWithBacktraceItem.addActionListener(ex);
        add(trapWithBacktraceItem);
        
        JMenu changeReturnValue = new JMenu("Change return value");
        
        JMenuItem changeReturnValuePtr = new JMenuItem("ptr");        
        changeReturnValuePtr.setActionCommand("changeReturnValuePtr");
        changeReturnValuePtr.addActionListener(ex);
        
        JMenuItem changeReturnValueString = new JMenuItem("String");        
        changeReturnValueString.setActionCommand("changeReturnValueString");
        changeReturnValueString.addActionListener(ex);
        
        JMenuItem changeReturnValueInt = new JMenuItem("int");        
        changeReturnValueInt.setActionCommand("changeReturnValueInt");
        changeReturnValueInt.addActionListener(ex);
        
        changeReturnValue.add(changeReturnValuePtr);
        changeReturnValue.add(changeReturnValueString);
        changeReturnValue.add(changeReturnValueInt);
        
        add(changeReturnValue);
        
    }
	
}