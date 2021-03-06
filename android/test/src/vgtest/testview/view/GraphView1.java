// Copyright (c) 2012-2013, https://github.com/rhcad/touchvg

package vgtest.testview.view;

import rhcad.touchvg.view.StdGraphView;
import rhcad.touchvg.view.ViewHelper;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import democmds.core.DemoCmdsGate;

public class GraphView1 extends StdGraphView {
    protected static final String PATH = "mnt/sdcard/TouchVG/";

    static {
        System.loadLibrary("democmds");
    }

    public GraphView1(Context context) {
        super(context);

        int flags = ((Activity) context).getIntent().getExtras().getInt("flags");
        final ViewHelper hlp = new ViewHelper(this);

        if ((flags & 32) != 0) {
            hlp.addShapesForTest();
        }
        if ((flags & 64) != 0) {
            hlp.startRecord(PATH + "record");
        }

        flags = flags & 0x0F;
        if ((flags & 1) != 0) {
            hlp.setCommand("select");
        } else if ((flags >> 1) == 1) {
            hlp.setCommand("splines");
        } else if ((flags >> 1) == 2) {
            hlp.setCommand("line");
        } else if ((flags >> 1) == 3) {
            hlp.setCommand("lines");
        } else if ((flags >> 1) == 4) {
            int n = DemoCmdsGate.registerCmds(hlp.cmdViewHandle());
            hlp.setCommand("hittest");
            Log.d("Test", "DemoCmdsGate.registerCmds = " + n + ", " + hlp.getCommand());
        }
    }
}
