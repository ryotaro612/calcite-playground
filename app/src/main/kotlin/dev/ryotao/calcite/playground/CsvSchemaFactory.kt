package dev.ryotao.calcite.playground

import org.apache.calcite.model.ModelHandler
import org.apache.calcite.schema.Schema
import org.apache.calcite.schema.SchemaFactory
import org.apache.calcite.schema.SchemaPlus
import java.io.File

/**
 * Factory that creates a {@link CsvSchema}.
 *
 * <p>Allows a custom schema to be included in a <code><i>model</i>.json</code>
 * file.
 */
class CsvSchemaFactory: SchemaFactory {
    /** Public singleton, per factory contract. */
//    public static final CsvSchemaFactory INSTANCE = new CsvSchemaFactory();
//
//    private CsvSchemaFactory() {
//    }
//
//    @Override public Schema create(SchemaPlus parentSchema, String name,
//    Map<String, Object> operand) {
//        final String directory = (String) operand.get("directory");
//        final File base =
//            (File) operand.get(ModelHandler.ExtraOperand.BASE_DIRECTORY.camelName);
//        File directoryFile = new File(directory);
//        if (base != null && !directoryFile.isAbsolute()) {
//            directoryFile = new File(base, directory);
//        }
//        String flavorName = (String) operand.get("flavor");
//        CsvTable.Flavor flavor;
//        if (flavorName == null) {
//            flavor = CsvTable.Flavor.SCANNABLE;
//        } else {
//            flavor = CsvTable.Flavor.valueOf(flavorName.toUpperCase(Locale.ROOT));
//        }
//        return new CsvSchema(directoryFile, flavor);
//    }
    override fun create(parentSchema: SchemaPlus?, name: String?, operand: Map<String, Any>): Schema {
        val directory=  operand["directory"] as String
        val base: File? = operand[ModelHandler.ExtraOperand.BASE_DIRECTORY.camelName] as File?
        var directoryFile = File(directory)
        if (base != null && !directoryFile.isAbsolute) {
            directoryFile = File(base, directory)
        }
        val flavorName = operand["flavor"] as String
//        var flavor: CsvTable.Flavor? = null
//        if (flavorName == null) {
//            flavor = CsvTable.Flavor.SCANNABLE;
//        } else {
//            flavor = CsvTable.Flavor.valueOf(flavorName.toUpperCase(Locale.ROOT));
//        }
//        return new CsvSchema(directoryFile, flavor)
        TODO()
    }
}