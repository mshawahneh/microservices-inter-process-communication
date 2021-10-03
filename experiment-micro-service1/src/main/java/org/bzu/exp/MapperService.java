package org.bzu.exp;

import org.bzu.exp.model.ExpModel;
import org.springframework.stereotype.Component;

@Component
public class MapperService {

	public ExpModel getNewModel(String suffix) {
		
		ExpModel model = new ExpModel();
		model.setAttr1("Attribute1-Value"+suffix);
		model.setAttr2("Attribute2-Value"+suffix);
		model.setAttr3("Attribute3-Value"+suffix);
		model.setAttr4("Attribute4-Value"+suffix);
		model.setAttr5("Attribute5-Value"+suffix);
		model.setAttr6("Attribute6-Value"+suffix);
		model.setAttr7("Attribute7-Value"+suffix);
		model.setAttr8("Attribute8-Value"+suffix);
		model.setAttr9("Attribute9-Value"+suffix);
		model.setAttr10("Attribute10-Value"+suffix);
		model.setAttr11("Attribute11-Value"+suffix);
		model.setAttr12("Attribute12-Value"+suffix);
		model.setAttr13("Attribute13-Value"+suffix);
		model.setAttr14("Attribute14-Value"+suffix);
		model.setAttr15("Attribute15-Value"+suffix);
		model.setAttr16("Attribute16-Value"+suffix);
		model.setAttr17("Attribute17-Value"+suffix);
		model.setAttr18("Attribute18-Value"+suffix);
		model.setAttr19("Attribute19-Value"+suffix);
		model.setAttr20("Attribute20-Value"+suffix);
		model.setAttr21("Attribute21-Value"+suffix);
		model.setAttr22("Attribute22-Value"+suffix);
		model.setAttr23("Attribute23-Value"+suffix);
		model.setAttr24("Attribute24-Value"+suffix);
		model.setAttr25("Attribute25-Value"+suffix);
		model.setAttr26("Attribute26-Value"+suffix);
		model.setAttr27("Attribute27-Value"+suffix);
		model.setAttr28("Attribute28-Value"+suffix);
		model.setAttr29("Attribute29-Value"+suffix);
		model.setAttr30("Attribute30-Value"+suffix);
		
		return model;
	}
}
