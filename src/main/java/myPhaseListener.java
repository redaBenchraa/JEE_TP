import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 * Created by reda-benchraa on 22/02/17.
 */
public class myPhaseListener implements PhaseListener {
    @Override
    public void afterPhase(PhaseEvent phaseEvent) {

        //System.out.println("Apres la phase "+phaseEvent.getPhaseId());
    }

    @Override
    public void beforePhase(PhaseEvent phaseEvent) {

        //System.out.println("Avant la phase "+phaseEvent.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
