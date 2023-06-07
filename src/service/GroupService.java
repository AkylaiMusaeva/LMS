package service;

import model.Company;
import model.Group;

public interface GroupService {
    Group[]saveGroup(Long companyId,Group...groups);
    Group getById(Long id,Group []groups);
    Group[]getAllGroupsByCompanyId(Long companyId);
    Group updateGroupByName(String name,Group group);
    String deleteGroupByCompanyId(Long companyId,Long GroupId);

}
