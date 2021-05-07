ALTER TABLE "users"
    ADD address_id UUID,
    ADD CONSTRAINT fk_user_address FOREIGN KEY(address_id) REFERENCES address(id),
    ADD supervisor_id UUID,
    ADD CONSTRAINT fk_user_supervisor FOREIGN KEY(supervisor_id) REFERENCES users(id),
    ADD site_id UUID,
    ADD CONSTRAINT fk_user_site FOREIGN KEY(site_id) REFERENCES site(id);