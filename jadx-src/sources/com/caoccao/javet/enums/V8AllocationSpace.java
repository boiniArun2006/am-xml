package com.caoccao.javet.enums;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'FIRST_SPACE' uses external variables
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
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class V8AllocationSpace {
    private static final /* synthetic */ V8AllocationSpace[] $VALUES;
    public static final V8AllocationSpace CODE_LO_SPACE;
    public static final V8AllocationSpace CODE_SPACE;
    public static final V8AllocationSpace FIRST_GROWABLE_PAGED_SPACE;
    public static final V8AllocationSpace FIRST_MUTABLE_SPACE;
    public static final V8AllocationSpace FIRST_SPACE;
    public static final V8AllocationSpace LAST_GROWABLE_PAGED_SPACE;
    public static final V8AllocationSpace LAST_MUTABLE_SPACE;
    public static final V8AllocationSpace LAST_SPACE;
    public static final V8AllocationSpace LO_SPACE;
    public static final V8AllocationSpace MAP_SPACE;
    public static final V8AllocationSpace NEW_LO_SPACE;
    public static final V8AllocationSpace NEW_SPACE;
    public static final V8AllocationSpace OLD_SPACE;
    public static final V8AllocationSpace RO_SPACE;
    private final int index;

    private static /* synthetic */ V8AllocationSpace[] $values() {
        return new V8AllocationSpace[]{RO_SPACE, OLD_SPACE, CODE_SPACE, MAP_SPACE, LO_SPACE, CODE_LO_SPACE, NEW_LO_SPACE, NEW_SPACE, FIRST_SPACE, LAST_SPACE, FIRST_MUTABLE_SPACE, LAST_MUTABLE_SPACE, FIRST_GROWABLE_PAGED_SPACE, LAST_GROWABLE_PAGED_SPACE};
    }

    static {
        V8AllocationSpace v8AllocationSpace = new V8AllocationSpace("RO_SPACE", 0, 0);
        RO_SPACE = v8AllocationSpace;
        V8AllocationSpace v8AllocationSpace2 = new V8AllocationSpace("OLD_SPACE", 1, 1);
        OLD_SPACE = v8AllocationSpace2;
        CODE_SPACE = new V8AllocationSpace("CODE_SPACE", 2, 2);
        V8AllocationSpace v8AllocationSpace3 = new V8AllocationSpace("MAP_SPACE", 3, 3);
        MAP_SPACE = v8AllocationSpace3;
        LO_SPACE = new V8AllocationSpace("LO_SPACE", 4, 4);
        CODE_LO_SPACE = new V8AllocationSpace("CODE_LO_SPACE", 5, 5);
        NEW_LO_SPACE = new V8AllocationSpace("NEW_LO_SPACE", 6, 6);
        V8AllocationSpace v8AllocationSpace4 = new V8AllocationSpace("NEW_SPACE", 7, 7);
        NEW_SPACE = v8AllocationSpace4;
        FIRST_SPACE = new V8AllocationSpace("FIRST_SPACE", 8, v8AllocationSpace.getIndex());
        LAST_SPACE = new V8AllocationSpace("LAST_SPACE", 9, v8AllocationSpace4.getIndex());
        FIRST_MUTABLE_SPACE = new V8AllocationSpace("FIRST_MUTABLE_SPACE", 10, v8AllocationSpace2.getIndex());
        LAST_MUTABLE_SPACE = new V8AllocationSpace("LAST_MUTABLE_SPACE", 11, v8AllocationSpace4.getIndex());
        FIRST_GROWABLE_PAGED_SPACE = new V8AllocationSpace("FIRST_GROWABLE_PAGED_SPACE", 12, v8AllocationSpace2.getIndex());
        LAST_GROWABLE_PAGED_SPACE = new V8AllocationSpace("LAST_GROWABLE_PAGED_SPACE", 13, v8AllocationSpace3.getIndex());
        $VALUES = $values();
    }

    public static V8AllocationSpace[] getDistinctValues() {
        return new V8AllocationSpace[]{RO_SPACE, OLD_SPACE, CODE_SPACE, MAP_SPACE, LO_SPACE, CODE_LO_SPACE, NEW_LO_SPACE, NEW_SPACE};
    }

    public static V8AllocationSpace valueOf(String str) {
        return (V8AllocationSpace) Enum.valueOf(V8AllocationSpace.class, str);
    }

    public static V8AllocationSpace[] values() {
        return (V8AllocationSpace[]) $VALUES.clone();
    }

    public int getIndex() {
        return this.index;
    }

    private V8AllocationSpace(String str, int i2, int i3) {
        this.index = i3;
    }
}
