package org.spongepowered.asm.mixin.gen;

import org.spongepowered.asm.lib.tree.InsnNode;
import org.spongepowered.asm.lib.tree.FieldInsnNode;
import org.spongepowered.asm.lib.tree.AbstractInsnNode;
import org.spongepowered.asm.lib.tree.VarInsnNode;
import org.spongepowered.asm.lib.tree.MethodNode;

public class AccessorGeneratorFieldSetter extends AccessorGeneratorField
{
    public AccessorGeneratorFieldSetter(final AccessorInfo a1) {
        super(a1);
    }
    
    @Override
    public MethodNode generate() {
        final int v1 = /*EL:47*/this.isInstanceField ? 1 : 0;
        final int v2 = /*EL:48*/v1 + this.targetType.getSize();
        final int v3 = /*EL:49*/v1 + this.targetType.getSize();
        final MethodNode v4 = /*EL:50*/this.createMethod(v2, v3);
        /*SL:51*/if (this.isInstanceField) {
            /*SL:52*/v4.instructions.add(new VarInsnNode(25, 0));
        }
        /*SL:54*/v4.instructions.add(new VarInsnNode(this.targetType.getOpcode(21), v1));
        final int v5 = /*EL:55*/this.isInstanceField ? 181 : 179;
        /*SL:56*/v4.instructions.add(new FieldInsnNode(v5, this.info.getClassNode().name, this.targetField.name, this.targetField.desc));
        /*SL:57*/v4.instructions.add(new InsnNode(177));
        /*SL:58*/return v4;
    }
}
