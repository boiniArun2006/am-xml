package com.caoccao.javet.interop.callback;

import com.caoccao.javet.interop.callback.IJavetDirectCallable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DirectCallGetterAndNoThis' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class JavetCallbackType {
    private static final /* synthetic */ JavetCallbackType[] $VALUES;
    public static final JavetCallbackType DirectCallGetterAndNoThis;
    public static final JavetCallbackType DirectCallGetterAndThis;
    public static final JavetCallbackType DirectCallNoThisAndNoResult;
    public static final JavetCallbackType DirectCallNoThisAndResult;
    public static final JavetCallbackType DirectCallSetterAndNoThis;
    public static final JavetCallbackType DirectCallSetterAndThis;
    public static final JavetCallbackType DirectCallThisAndNoResult;
    public static final JavetCallbackType DirectCallThisAndResult;
    public static final JavetCallbackType Reflection;
    private final Class<? extends IJavetDirectCallable.DirectCall> directCallClass;
    private final Boolean returnResult;
    private final Boolean thisObjectRequired;

    private static /* synthetic */ JavetCallbackType[] $values() {
        return new JavetCallbackType[]{DirectCallGetterAndNoThis, DirectCallGetterAndThis, DirectCallSetterAndNoThis, DirectCallSetterAndThis, DirectCallNoThisAndNoResult, DirectCallNoThisAndResult, DirectCallThisAndNoResult, DirectCallThisAndResult, Reflection};
    }

    static {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        DirectCallGetterAndNoThis = new JavetCallbackType("DirectCallGetterAndNoThis", 0, IJavetDirectCallable.GetterAndNoThis.class, bool, bool2);
        DirectCallGetterAndThis = new JavetCallbackType("DirectCallGetterAndThis", 1, IJavetDirectCallable.GetterAndThis.class, bool2, bool2);
        DirectCallSetterAndNoThis = new JavetCallbackType("DirectCallSetterAndNoThis", 2, IJavetDirectCallable.SetterAndNoThis.class, bool, bool2);
        DirectCallSetterAndThis = new JavetCallbackType("DirectCallSetterAndThis", 3, IJavetDirectCallable.SetterAndThis.class, bool2, bool2);
        DirectCallNoThisAndNoResult = new JavetCallbackType("DirectCallNoThisAndNoResult", 4, IJavetDirectCallable.NoThisAndNoResult.class, bool, bool);
        DirectCallNoThisAndResult = new JavetCallbackType("DirectCallNoThisAndResult", 5, IJavetDirectCallable.NoThisAndResult.class, bool, bool2);
        DirectCallThisAndNoResult = new JavetCallbackType("DirectCallThisAndNoResult", 6, IJavetDirectCallable.ThisAndNoResult.class, bool2, bool);
        DirectCallThisAndResult = new JavetCallbackType("DirectCallThisAndResult", 7, IJavetDirectCallable.ThisAndResult.class, bool2, bool2);
        Reflection = new JavetCallbackType("Reflection", 8, null, null, null);
        $VALUES = $values();
    }

    public static JavetCallbackType valueOf(String str) {
        return (JavetCallbackType) Enum.valueOf(JavetCallbackType.class, str);
    }

    public static JavetCallbackType[] values() {
        return (JavetCallbackType[]) $VALUES.clone();
    }

    public Class<? extends IJavetDirectCallable.DirectCall> getDirectCallClass() {
        return this.directCallClass;
    }

    public Boolean getReturnResult() {
        return this.returnResult;
    }

    public Boolean getThisObjectRequired() {
        return this.thisObjectRequired;
    }

    private JavetCallbackType(String str, int i2, Class cls, Boolean bool, Boolean bool2) {
        this.directCallClass = cls;
        this.returnResult = bool2;
        this.thisObjectRequired = bool;
    }
}
