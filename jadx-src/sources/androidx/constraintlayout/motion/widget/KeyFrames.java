package androidx.constraintlayout.motion.widget;

import YgZ.uQga.IYJfqUyym;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class KeyFrames {
    static HashMap rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private HashMap f35664n = new HashMap();

    static {
        HashMap map = new HashMap();
        rl = map;
        try {
            map.put("KeyAttribute", KeyAttributes.class.getConstructor(new Class[0]));
            rl.put("KeyPosition", KeyPosition.class.getConstructor(new Class[0]));
            rl.put(IYJfqUyym.rRsdginWdPDO, KeyCycle.class.getConstructor(new Class[0]));
            rl.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(new Class[0]));
            rl.put("KeyTrigger", KeyTrigger.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e2) {
            Log.e("KeyFrames", "unable to load", e2);
        }
    }

    public void n(MotionController motionController) {
        ArrayList arrayList = (ArrayList) this.f35664n.get(-1);
        if (arrayList != null) {
            motionController.rl(arrayList);
        }
    }

    public ArrayList nr(int i2) {
        return (ArrayList) this.f35664n.get(Integer.valueOf(i2));
    }

    public void rl(MotionController motionController) {
        ArrayList arrayList = (ArrayList) this.f35664n.get(Integer.valueOf(motionController.f35712t));
        if (arrayList != null) {
            motionController.rl(arrayList);
        }
        ArrayList<Key> arrayList2 = (ArrayList) this.f35664n.get(-1);
        if (arrayList2 != null) {
            for (Key key : arrayList2) {
                if (key.O(((ConstraintLayout.LayoutParams) motionController.rl.getLayoutParams()).f35938a)) {
                    motionController.n(key);
                }
            }
        }
    }

    public void t(Key key) {
        if (!this.f35664n.containsKey(Integer.valueOf(key.rl))) {
            this.f35664n.put(Integer.valueOf(key.rl), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) this.f35664n.get(Integer.valueOf(key.rl));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }
}
