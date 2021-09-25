package A;
import java.util.List;

public class AlgoTraderJob {
	long ID;
	String name, command;
	List<Long> dependencyIDs;

	public AlgoTraderJob(long iD, String name, String command, List<Long> dependencyIDs) {
		super();
		ID = iD;
		this.name = name;
		this.command = command;
		this.dependencyIDs = dependencyIDs;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public List<Long> getDependencies() {
		return dependencyIDs;
	}

	public void setDependencies(List<Long> dependencies) {
		this.dependencyIDs = dependencies;
	}

	@Override
	public String toString() {
		return "AlgoTraderJob [ID=" + ID + ", name=" + name + ", command=" + command + "]";
	}

}
