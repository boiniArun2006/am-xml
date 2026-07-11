package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class OnSwipe {
    private Boundary HI;
    private String J2;
    private float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private TouchUp f35128O;
    private float Uo;
    private float az;
    private Mode ck;
    private float gh;
    private float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drag f35129n;
    private String nr;
    private float qie;
    private Side rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f35130t;
    private float ty;
    private float xMQ;

    public enum Boundary {
        OVERSHOOT,
        BOUNCE_START,
        BOUNCE_END,
        BOUNCE_BOTH
    }

    public enum Drag {
        UP,
        DOWN,
        LEFT,
        RIGHT,
        START,
        END,
        CLOCKWISE,
        ANTICLOCKWISE
    }

    public enum Mode {
        VELOCITY,
        SPRING
    }

    public enum Side {
        TOP,
        LEFT,
        RIGHT,
        BOTTOM,
        MIDDLE,
        START,
        END
    }

    public enum TouchUp {
        AUTOCOMPLETE,
        TO_START,
        NEVER_COMPLETE_END,
        TO_END,
        STOP,
        DECELERATE,
        DECELERATE_COMPLETE,
        NEVER_COMPLETE_START
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OnSwipe:{\n");
        if (this.f35130t != null) {
            sb.append("anchor:'");
            sb.append(this.f35130t);
            sb.append("',\n");
        }
        if (this.f35129n != null) {
            sb.append("direction:'");
            sb.append(this.f35129n.toString().toLowerCase());
            sb.append("',\n");
        }
        if (this.rl != null) {
            sb.append("side:'");
            sb.append(this.rl.toString().toLowerCase());
            sb.append("',\n");
        }
        if (!Float.isNaN(this.xMQ)) {
            sb.append("scale:'");
            sb.append(this.xMQ);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.mUb)) {
            sb.append("threshold:'");
            sb.append(this.mUb);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.Uo)) {
            sb.append("maxVelocity:'");
            sb.append(this.Uo);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.KN)) {
            sb.append("maxAccel:'");
            sb.append(this.KN);
            sb.append("',\n");
        }
        if (this.nr != null) {
            sb.append("limitBounds:'");
            sb.append(this.nr);
            sb.append("',\n");
        }
        if (this.ck != null) {
            sb.append("mode:'");
            sb.append(this.ck.toString().toLowerCase());
            sb.append("',\n");
        }
        if (this.f35128O != null) {
            sb.append("touchUp:'");
            sb.append(this.f35128O.toString().toLowerCase());
            sb.append("',\n");
        }
        if (!Float.isNaN(this.qie)) {
            sb.append("springMass:'");
            sb.append(this.qie);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.az)) {
            sb.append("springStiffness:'");
            sb.append(this.az);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.gh)) {
            sb.append("springDamping:'");
            sb.append(this.gh);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.ty)) {
            sb.append("stopThreshold:'");
            sb.append(this.ty);
            sb.append("',\n");
        }
        if (this.HI != null) {
            sb.append("springBoundary:'");
            sb.append(this.HI);
            sb.append("',\n");
        }
        if (this.J2 != null) {
            sb.append("around:'");
            sb.append(this.J2);
            sb.append("',\n");
        }
        sb.append("},\n");
        return sb.toString();
    }
}
