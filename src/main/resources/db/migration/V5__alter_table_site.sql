ALTER TABLE "site"
    ADD site_manager_id  UUID,
    ADD CONSTRAINT fk_site_user FOREIGN KEY(site_manager_id) REFERENCES users(id),
    ADD location_id UUID,
    ADD CONSTRAINT fk_site_location FOREIGN KEY(location_id) REFERENCES address(id);