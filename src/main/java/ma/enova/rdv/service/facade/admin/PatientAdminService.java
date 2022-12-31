package ma.enova.rdv.service.facade.admin;

import java.util.List;
import ma.enova.rdv.bean.core.Patient;
import ma.enova.rdv.ws.dto.PatientDto;
import ma.enova.rdv.zynerator.service.IService;
import ma.enova.rdv.dao.criteria.core.PatientCriteria;
import ma.enova.rdv.dao.criteria.history.PatientHistoryCriteria;



public interface PatientAdminService extends IService<Patient, PatientDto,PatientCriteria, PatientHistoryCriteria> {
    //Patient findOrSave(Patient patient);


}
