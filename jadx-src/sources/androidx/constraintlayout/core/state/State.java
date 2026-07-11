package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference;
import androidx.constraintlayout.core.state.helpers.AlignVerticallyReference;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.core.state.helpers.VerticalChainReference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class State {
    public static final Integer gh = 0;
    public final ConstraintReference J2;
    ArrayList KN;
    private int Uo;
    boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CorePixelDp f35399n;
    ArrayList xMQ;
    private boolean rl = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected HashMap f35400t = new HashMap();
    protected HashMap nr = new HashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    HashMap f35398O = new HashMap();

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 androidx.constraintlayout.core.state.State$Chain, still in use, count: 1, list:
      (r0v0 androidx.constraintlayout.core.state.State$Chain) from 0x0044: INVOKE 
      (wrap:java.util.Map:0x0040: SGET  A[WRAPPED] (LINE:66) androidx.constraintlayout.core.state.State.Chain.J2 java.util.Map)
      ("spread")
      (r0v0 androidx.constraintlayout.core.state.State$Chain)
     INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:71)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Chain {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;

        public static Map J2 = new HashMap();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static Map f35404r = new HashMap();

        static {
            J2.put("packed", new Chain());
            J2.put("spread_inside", new Chain());
            J2.put("spread", new Chain());
            f35404r.put("packed", 2);
            f35404r.put("spread_inside", 1);
            f35404r.put("spread", 0);
        }

        public static int rl(String str) {
            if (f35404r.containsKey(str)) {
                return ((Integer) f35404r.get(str)).intValue();
            }
            return -1;
        }

        public static Chain valueOf(String str) {
            return (Chain) Enum.valueOf(Chain.class, str);
        }

        public static Chain[] values() {
            return (Chain[]) f35403o.clone();
        }

        private Chain() {
        }
    }

    public enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        TOP_TO_BASELINE,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BOTTOM_TO_BASELINE,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum Direction {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    public enum Helper {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        HORIZONTAL_FLOW,
        VERTICAL_FLOW,
        GRID,
        ROW,
        COLUMN,
        FLOW
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 androidx.constraintlayout.core.state.State$Wrap, still in use, count: 1, list:
      (r0v0 androidx.constraintlayout.core.state.State$Wrap) from 0x0036: INVOKE 
      (wrap:java.util.Map:0x0032: SGET  A[WRAPPED] (LINE:52) androidx.constraintlayout.core.state.State.Wrap.J2 java.util.Map)
      ("none")
      (r0v0 androidx.constraintlayout.core.state.State$Wrap)
     INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:57)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Wrap {
        NONE,
        CHAIN,
        ALIGNED;

        public static Map J2 = new HashMap();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static Map f35440r = new HashMap();

        static {
            J2.put("none", new Wrap());
            J2.put("chain", new Wrap());
            J2.put("aligned", new Wrap());
            f35440r.put("none", 0);
            f35440r.put("chain", 3);
            f35440r.put("aligned", 2);
        }

        public static int rl(String str) {
            if (f35440r.containsKey(str)) {
                return ((Integer) f35440r.get(str)).intValue();
            }
            return -1;
        }

        public static Wrap valueOf(String str) {
            return (Wrap) Enum.valueOf(Wrap.class, str);
        }

        public static Wrap[] values() {
            return (Wrap[]) f35439o.clone();
        }

        private Wrap() {
        }
    }

    public HorizontalChainReference HI() {
        return (HorizontalChainReference) ty(null, Helper.HORIZONTAL_CHAIN);
    }

    public GuidelineReference ck(Object obj) {
        return qie(obj, 0);
    }

    public GuidelineReference fD(Object obj) {
        return qie(obj, 1);
    }

    public VerticalChainReference iF() {
        return (VerticalChainReference) ty(null, Helper.VERTICAL_CHAIN);
    }

    private String Uo() {
        StringBuilder sb = new StringBuilder();
        sb.append("__HELPER_KEY_");
        int i2 = this.Uo;
        this.Uo = i2 + 1;
        sb.append(i2);
        sb.append("__");
        return sb.toString();
    }

    public boolean Ik(ConstraintWidget constraintWidget) {
        if (this.mUb) {
            this.xMQ.clear();
            Iterator it = this.KN.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidgetN = ((Reference) this.f35400t.get(it.next())).n();
                if (constraintWidgetN != null) {
                    this.xMQ.add(constraintWidgetN);
                }
            }
            this.mUb = false;
        }
        return this.xMQ.contains(constraintWidget);
    }

    public ConstraintReference J2(Object obj) {
        return new ConstraintReference(this);
    }

    CorePixelDp KN() {
        return this.f35399n;
    }

    public int O(Object obj) {
        if (obj instanceof Float) {
            return Math.round(((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public boolean S(int i2) {
        return this.J2.iF().xMQ(i2);
    }

    public State ViF(Dimension dimension) {
        this.J2.FX(dimension);
        return this;
    }

    public boolean WPU(int i2) {
        return this.J2.E2().xMQ(i2);
    }

    public void XQ() {
        Iterator it = this.f35400t.keySet().iterator();
        while (it.hasNext()) {
            ((Reference) this.f35400t.get(it.next())).n().n1();
        }
        this.f35400t.clear();
        this.f35400t.put(gh, this.J2);
        this.nr.clear();
        this.f35398O.clear();
        this.KN.clear();
        this.mUb = true;
    }

    Reference Z(Object obj) {
        return (Reference) this.f35400t.get(obj);
    }

    public void aYN(CorePixelDp corePixelDp) {
        this.f35399n = corePixelDp;
    }

    public ArrayList gh(String str) {
        if (this.f35398O.containsKey(str)) {
            return (ArrayList) this.f35398O.get(str);
        }
        return null;
    }

    public void nY(boolean z2) {
        this.rl = !z2;
    }

    public ConstraintReference nr(Object obj) {
        Reference referenceJ2 = (Reference) this.f35400t.get(obj);
        if (referenceJ2 == null) {
            referenceJ2 = J2(obj);
            this.f35400t.put(obj, referenceJ2);
            referenceJ2.t(obj);
        }
        if (referenceJ2 instanceof ConstraintReference) {
            return (ConstraintReference) referenceJ2;
        }
        return null;
    }

    public boolean r() {
        return !this.rl;
    }

    public void t(Object obj) {
        this.KN.add(obj);
        this.mUb = true;
    }

    public State te(Dimension dimension) {
        this.J2.Nxk(dimension);
        return this;
    }

    public HelperReference ty(Object obj, Helper helper) {
        if (obj == null) {
            obj = Uo();
        }
        HelperReference horizontalChainReference = (HelperReference) this.nr.get(obj);
        if (horizontalChainReference == null) {
            switch (helper) {
                case HORIZONTAL_CHAIN:
                    horizontalChainReference = new HorizontalChainReference(this);
                    break;
                case VERTICAL_CHAIN:
                    horizontalChainReference = new VerticalChainReference(this);
                    break;
                case ALIGN_HORIZONTALLY:
                    horizontalChainReference = new AlignHorizontallyReference(this);
                    break;
                case ALIGN_VERTICALLY:
                    horizontalChainReference = new AlignVerticallyReference(this);
                    break;
                case BARRIER:
                    horizontalChainReference = new BarrierReference(this);
                    break;
                case LAYER:
                default:
                    horizontalChainReference = new HelperReference(this, helper);
                    break;
                case HORIZONTAL_FLOW:
                case VERTICAL_FLOW:
                    horizontalChainReference = new FlowReference(this, helper);
                    break;
                case GRID:
                case ROW:
                case COLUMN:
                    horizontalChainReference = new GridReference(this, helper);
                    break;
            }
            horizontalChainReference.t(obj);
            this.nr.put(obj, horizontalChainReference);
        }
        return horizontalChainReference;
    }

    public State() {
        ConstraintReference constraintReference = new ConstraintReference(this);
        this.J2 = constraintReference;
        this.Uo = 0;
        this.KN = new ArrayList();
        this.xMQ = new ArrayList();
        this.mUb = true;
        Integer num = gh;
        constraintReference.t(num);
        this.f35400t.put(num, constraintReference);
    }

    public State E2(Dimension dimension) {
        return te(dimension);
    }

    public State az(Dimension dimension) {
        return ViF(dimension);
    }

    public void g(String str, String str2) {
        ArrayList arrayList;
        ConstraintReference constraintReferenceNr = nr(str);
        if (constraintReferenceNr != null) {
            constraintReferenceNr.D(str2);
            if (!this.f35398O.containsKey(str2)) {
                arrayList = new ArrayList();
                this.f35398O.put(str2, arrayList);
            } else {
                arrayList = (ArrayList) this.f35398O.get(str2);
            }
            arrayList.add(str);
        }
    }

    public GridReference mUb(Object obj, String str) {
        ConstraintReference constraintReferenceNr = nr(obj);
        if (constraintReferenceNr.nr() == null || !(constraintReferenceNr.nr() instanceof GridReference)) {
            Helper helper = Helper.GRID;
            if (str.charAt(0) == 'r') {
                helper = Helper.ROW;
            } else if (str.charAt(0) == 'c') {
                helper = Helper.COLUMN;
            }
            constraintReferenceNr.M(new GridReference(this, helper));
        }
        return (GridReference) constraintReferenceNr.nr();
    }

    public void n(ConstraintWidgetContainer constraintWidgetContainer) {
        HelperReference helperReference;
        HelperWidget helperWidgetFcU;
        HelperWidget helperWidgetFcU2;
        constraintWidgetContainer.wKp();
        this.J2.E2().n(this, constraintWidgetContainer, 0);
        this.J2.iF().n(this, constraintWidgetContainer, 1);
        for (Object obj : this.nr.keySet()) {
            HelperWidget helperWidgetFcU3 = ((HelperReference) this.nr.get(obj)).fcU();
            if (helperWidgetFcU3 != null) {
                Reference referenceNr = (Reference) this.f35400t.get(obj);
                if (referenceNr == null) {
                    referenceNr = nr(obj);
                }
                referenceNr.rl(helperWidgetFcU3);
            }
        }
        for (Object obj2 : this.f35400t.keySet()) {
            Reference reference = (Reference) this.f35400t.get(obj2);
            if (reference != this.J2 && (reference.nr() instanceof HelperReference) && (helperWidgetFcU2 = ((HelperReference) reference.nr()).fcU()) != null) {
                Reference referenceNr2 = (Reference) this.f35400t.get(obj2);
                if (referenceNr2 == null) {
                    referenceNr2 = nr(obj2);
                }
                referenceNr2.rl(helperWidgetFcU2);
            }
        }
        Iterator it = this.f35400t.keySet().iterator();
        while (it.hasNext()) {
            Reference reference2 = (Reference) this.f35400t.get(it.next());
            if (reference2 != this.J2) {
                ConstraintWidget constraintWidgetN = reference2.n();
                constraintWidgetN.i(reference2.getKey().toString());
                constraintWidgetN.JVN(null);
                if (reference2.nr() instanceof GuidelineReference) {
                    reference2.apply();
                }
                constraintWidgetContainer.n(constraintWidgetN);
            } else {
                reference2.rl(constraintWidgetContainer);
            }
        }
        Iterator it2 = this.nr.keySet().iterator();
        while (it2.hasNext()) {
            HelperReference helperReference2 = (HelperReference) this.nr.get(it2.next());
            if (helperReference2.fcU() != null) {
                Iterator it3 = helperReference2.xg.iterator();
                while (it3.hasNext()) {
                    helperReference2.fcU().n(((Reference) this.f35400t.get(it3.next())).n());
                }
                helperReference2.apply();
            } else {
                helperReference2.apply();
            }
        }
        Iterator it4 = this.f35400t.keySet().iterator();
        while (it4.hasNext()) {
            Reference reference3 = (Reference) this.f35400t.get(it4.next());
            if (reference3 != this.J2 && (reference3.nr() instanceof HelperReference) && (helperWidgetFcU = (helperReference = (HelperReference) reference3.nr()).fcU()) != null) {
                for (Object obj3 : helperReference.xg) {
                    Reference reference4 = (Reference) this.f35400t.get(obj3);
                    if (reference4 != null) {
                        helperWidgetFcU.n(reference4.n());
                    } else if (obj3 instanceof Reference) {
                        helperWidgetFcU.n(((Reference) obj3).n());
                    } else {
                        System.out.println("couldn't find reference for " + obj3);
                    }
                }
                reference3.apply();
            }
        }
        for (Object obj4 : this.f35400t.keySet()) {
            Reference reference5 = (Reference) this.f35400t.get(obj4);
            reference5.apply();
            ConstraintWidget constraintWidgetN2 = reference5.n();
            if (constraintWidgetN2 != null && obj4 != null) {
                constraintWidgetN2.HI = obj4.toString();
            }
        }
    }

    public void o(Object obj, Object obj2) {
        ConstraintReference constraintReferenceNr = nr(obj);
        if (constraintReferenceNr != null) {
            constraintReferenceNr.GR(obj2);
        }
    }

    public GuidelineReference qie(Object obj, int i2) {
        ConstraintReference constraintReferenceNr = nr(obj);
        if (constraintReferenceNr.nr() == null || !(constraintReferenceNr.nr() instanceof GuidelineReference)) {
            GuidelineReference guidelineReference = new GuidelineReference(this);
            guidelineReference.Uo(i2);
            guidelineReference.t(obj);
            constraintReferenceNr.M(guidelineReference);
        }
        return (GuidelineReference) constraintReferenceNr.nr();
    }

    public BarrierReference rl(Object obj, Direction direction) {
        ConstraintReference constraintReferenceNr = nr(obj);
        if (constraintReferenceNr.nr() == null || !(constraintReferenceNr.nr() instanceof BarrierReference)) {
            BarrierReference barrierReference = new BarrierReference(this);
            barrierReference.ul(direction);
            constraintReferenceNr.M(barrierReference);
        }
        return (BarrierReference) constraintReferenceNr.nr();
    }

    public FlowReference xMQ(Object obj, boolean z2) {
        FlowReference flowReference;
        ConstraintReference constraintReferenceNr = nr(obj);
        if (constraintReferenceNr.nr() == null || !(constraintReferenceNr.nr() instanceof FlowReference)) {
            if (z2) {
                flowReference = new FlowReference(this, Helper.VERTICAL_FLOW);
            } else {
                flowReference = new FlowReference(this, Helper.HORIZONTAL_FLOW);
            }
            constraintReferenceNr.M(flowReference);
        }
        return (FlowReference) constraintReferenceNr.nr();
    }
}
