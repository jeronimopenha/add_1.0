package hebe.examples.dataflow_sync;

import hebe.dataflow.DataflowSyncSimulBase;

/**
 * FIR_4 data flow (Automatically generated) example in the simulator.<br>
 * Universidade Federal de Viçosa - MG - Brasil.
 *
 * @author Jeronimo Costa Penha - jeronimopenha@gmail.com
 * @author Ricardo Santos Ferreira - cacauvicosa@gmail.com
 * @version 1.0
 */
public class Fir4DataflowHadesSimulationWithGeneratedHds {

    public static void main(String argv[]) {
        DataflowSyncSimulBase dataflowBase = new DataflowSyncSimulBase();
        dataflowBase.startSimulation("DEMO/FIR_4_DATAFLOW_CONF.txt", "/DESIGN/FIR_4_DATAFLOW_GENERATED.hds", "\nDesired Return: 10 20 30 40 50 60 70...\n", 46);

    }
}
