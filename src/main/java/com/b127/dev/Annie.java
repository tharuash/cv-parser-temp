package com.b127.dev;

import gate.Corpus;
import gate.CorpusController;
import gate.Gate;
import gate.util.GateException;
import gate.util.persistence.PersistenceManager;

import java.io.File;
import java.io.IOException;

/**
 * This class illustrates how to use ANNIE as a sausage machine
 * in another application - put ingredients in one end (URLs pointing
 * to documents) and get sausages (e.g. Named Entities) out the
 * other end.
 * <P><B>NOTE:</B><BR>
 * For simplicity's sake, we don't do any exception handling.
 */
public class Annie {

    private CorpusController annieController;

    public void initAnnie() throws GateException, IOException {
        File gateHome = Gate.getGateHome();
        File annieGapp = new File(gateHome, "ANNIEResumeParser.gapp");
        annieController = (CorpusController) PersistenceManager.loadObjectFromFile(annieGapp);
    }

    public void setCorpus(Corpus corpus) {
        annieController.setCorpus(corpus);
    }

    public void execute() throws GateException {
        annieController.execute();
    }
}
