import com.neuronrobotics.bowlerstudio.scripting.ScriptingEngine

import eu.mihosoft.vrl.v3d.CSG
println "Cadoodle Start Up";

File xml = com.neuronrobotics.bowlerstudio.scripting.ScriptingEngine.fileFromGit(
	"https://github.com/OntologicalCAD/OntologicalCAD-script.git", 
	"MainWindow.fxml")
File icon = com.neuronrobotics.bowlerstudio.scripting.ScriptingEngine.fileFromGit(
	"https://github.com/OntologicalCAD/OntologicalCAD-script.git", 
	"SourceIcon.png")

class MainWindow extends javafx.scene.control.Tab implements com.neuronrobotics.bowlerstudio.IStageReceiver{
	void receiveStage(javafx.stage.Stage stage,javafx.scene.Scene scene) {
		println "Cadoodle recived stage";
	}
}
def controller = ScriptingEngine.gitScriptRun("https://github.com/OntologicalCAD/OntologicalCAD-script.git", "main-window-controller.groovy")
javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(xml.toURI().toURL());
loader.setController(controller)
javafx.scene.layout.Pane newLoadedPane =  loader.load();
// Create a tab
MainWindow myTab = new MainWindow();
//set the title of the new tab
myTab.setContent(newLoadedPane);
return myTab;