package com.caoccao.javet.enums;

import com.caoccao.javet.enums.JSScopeType;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.caoccao.javet.enums.JSScopeType, still in use, count: 1, list:
  (r0v0 com.caoccao.javet.enums.JSScopeType) from 0x00a1: APUT 
  (r4v8 com.caoccao.javet.enums.JSScopeType[])
  (4 ??[int, float, short, byte, char])
  (r0v0 com.caoccao.javet.enums.JSScopeType)
 (LINE:163)
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
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class JSScopeType {
    Script(0, "Script"),
    ReplMode(1, "ReplMode"),
    Class(2, "Class"),
    Eval(3, "Eval"),
    Function(4, "Function"),
    Module(5, "Module"),
    Catch(6, "Catch"),
    Block(7, "Block"),
    With(8, "With"),
    ShadowRealm(9, "ShadowRealm"),
    Unknown(10, "Unknown");

    private static final JSScopeType[] NODE_TYPES;
    private static final int NODE_TYPE_LENGTH;
    private static final JSScopeType[] V8_TYPES;
    private static final int V8_TYPE_LENGTH;
    private final int id;
    private final String name;

    static {
        int length = values().length - 2;
        NODE_TYPE_LENGTH = length;
        JSScopeType[] jSScopeTypeArr = new JSScopeType[length];
        NODE_TYPES = jSScopeTypeArr;
        int length2 = values().length + 1;
        V8_TYPE_LENGTH = length2;
        V8_TYPES = new JSScopeType[length2];
        jSScopeTypeArr[0] = new JSScopeType(2, "Class");
        jSScopeTypeArr[1] = new JSScopeType(3, "Eval");
        jSScopeTypeArr[2] = new JSScopeType(4, "Function");
        jSScopeTypeArr[3] = new JSScopeType(5, "Module");
        jSScopeTypeArr[4] = new JSScopeType(0, "Script");
        jSScopeTypeArr[5] = new JSScopeType(6, "Catch");
        jSScopeTypeArr[6] = new JSScopeType(7, "Block");
        jSScopeTypeArr[7] = new JSScopeType(8, "With");
        jSScopeTypeArr[8] = new JSScopeType(10, "Unknown");
        Stream.of((Object[]) values()).forEach(new Consumer() { // from class: Flz.fuX
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                JSScopeType.n((JSScopeType) obj);
            }
        });
    }

    public static /* synthetic */ void n(JSScopeType jSScopeType) {
        V8_TYPES[jSScopeType.getId()] = jSScopeType;
    }

    public static JSScopeType valueOf(String str) {
        return (JSScopeType) Enum.valueOf(JSScopeType.class, str);
    }

    public static JSScopeType[] values() {
        return (JSScopeType[]) $VALUES.clone();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isBlock() {
        return this == Block;
    }

    public boolean isCatch() {
        return this == Catch;
    }

    public boolean isClass() {
        return this == Class;
    }

    public boolean isEval() {
        return this == Eval;
    }

    public boolean isFunction() {
        return this == Function;
    }

    public boolean isModule() {
        return this == Module;
    }

    public boolean isScript() {
        return this == Script;
    }

    public boolean isUnknown() {
        return this == Unknown;
    }

    public boolean isWith() {
        return this == With;
    }

    private JSScopeType(int i2, String str) {
        this.id = i2;
        this.name = str;
    }

    public static JSScopeType parse(int i2, JSRuntimeType jSRuntimeType) {
        Objects.requireNonNull(jSRuntimeType);
        if (jSRuntimeType.isNode()) {
            if (i2 >= 0 && i2 < NODE_TYPE_LENGTH) {
                return NODE_TYPES[i2];
            }
            return Unknown;
        }
        if (i2 >= 0 && i2 < V8_TYPE_LENGTH) {
            return V8_TYPES[i2];
        }
        return Unknown;
    }
}
