package modelling;

import modelling.interfaces.ISection;
import modelling.interfaces.ISectionParser;

public class SectionParser implements ISectionParser {

	
	@Override
	public String parseFile(ISection section) {
		MarkdownProcessor processor = new MarkdownProcessor();
		return processor.processSection(section.getContent());
	}

}
